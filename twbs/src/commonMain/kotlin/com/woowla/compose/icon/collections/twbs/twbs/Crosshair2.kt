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

public val Twbs.Crosshair2: ImageVector
    get() {
        if (_crosshair2 != null) {
            return _crosshair2!!
        }
        _crosshair2 = Builder(name = "Crosshair2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.518f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 14.982f, 7.5f)
                horizontalLineToRelative(0.518f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-0.518f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 8.5f, 14.982f)
                verticalLineToRelative(0.518f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-0.518f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 1.018f, 8.5f)
                lineTo(0.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(0.518f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 7.5f, 1.018f)
                lineTo(7.5f, 0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 0.0f)
                moveToRelative(-0.5f, 2.02f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.02f, 7.5f)
                horizontalLineToRelative(1.005f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.5f, 3.025f)
                close()
                moveTo(8.5f, 3.025f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.975f, 7.5f)
                horizontalLineToRelative(1.005f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.5f, 2.02f)
                close()
                moveTo(12.975f, 8.5f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.5f, 12.975f)
                verticalLineToRelative(1.005f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.48f, -5.48f)
                close()
                moveTo(7.5f, 12.975f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 3.025f, 8.5f)
                lineTo(2.02f, 8.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.48f, 5.48f)
                close()
                moveTo(10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
            }
        }
        .build()
        return _crosshair2!!
    }

private var _crosshair2: ImageVector? = null
