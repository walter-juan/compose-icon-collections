package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Crosshair: ImageVector
    get() {
        if (_crosshair != null) {
            return _crosshair!!
        }
        _crosshair = Builder(name = "Crosshair", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(0.518f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 1.018f, 7.5f)
                lineTo(0.5f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(0.518f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 7.5f, 14.982f)
                verticalLineToRelative(0.518f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-0.518f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 14.982f, 8.5f)
                horizontalLineToRelative(0.518f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-0.518f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 8.5f, 1.018f)
                close()
                moveTo(2.02f, 7.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 7.5f, 2.02f)
                verticalLineToRelative(0.48f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-0.48f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.48f, 5.48f)
                horizontalLineToRelative(-0.48f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(0.48f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.48f, 5.48f)
                verticalLineToRelative(-0.48f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(0.48f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 2.02f, 8.5f)
                horizontalLineToRelative(0.48f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(8.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
            }
        }
        .build()
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
