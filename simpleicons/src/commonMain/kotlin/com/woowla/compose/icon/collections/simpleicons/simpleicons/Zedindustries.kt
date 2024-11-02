package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Zedindustries: ImageVector
    get() {
        if (_zedindustries != null) {
            return _zedindustries!!
        }
        _zedindustries = Builder(name = "Zedindustries", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.25f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(16.5f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 2.25f, 0.0f)
                horizontalLineToRelative(20.095f)
                curveToRelative(1.002f, 0.0f, 1.504f, 1.212f, 0.795f, 1.92f)
                lineTo(10.764f, 14.298f)
                horizontalLineToRelative(3.486f)
                verticalLineTo(12.75f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.922f)
                arcToRelative(1.125f, 1.125f, 0.0f, false, true, -1.125f, 1.125f)
                horizontalLineTo(9.264f)
                lineToRelative(-2.578f, 2.578f)
                horizontalLineToRelative(11.689f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(9.375f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(5.185f)
                lineTo(2.562f, 22.5f)
                horizontalLineTo(21.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.75f, -0.75f)
                verticalLineTo(5.25f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(16.5f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 21.75f, 24.0f)
                horizontalLineTo(1.655f)
                curveTo(0.653f, 24.0f, 0.151f, 22.788f, 0.86f, 22.08f)
                lineTo(13.19f, 9.75f)
                horizontalLineTo(9.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(9.375f)
                arcTo(1.125f, 1.125f, 0.0f, false, true, 9.375f, 8.25f)
                horizontalLineToRelative(5.314f)
                lineToRelative(2.625f, -2.625f)
                horizontalLineTo(5.625f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(5.625f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(13.19f)
                lineTo(21.438f, 1.5f)
                close()
            }
        }
        .build()
        return _zedindustries!!
    }

private var _zedindustries: ImageVector? = null
