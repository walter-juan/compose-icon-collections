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

public val Twbs.SignNoParking: ImageVector
    get() {
        if (_signNoParking != null) {
            return _signNoParking!!
        }
        _signNoParking = Builder(name = "SignNoParking", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                moveToRelative(5.29f, -3.416f)
                lineTo(9.63f, 8.923f)
                curveTo(10.5f, 8.523f, 11.0f, 7.66f, 11.0f, 6.586f)
                curveToRelative(0.0f, -1.482f, -0.955f, -2.584f, -2.538f, -2.584f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(0.79f)
                lineTo(3.416f, 2.71f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 9.874f, 9.874f)
                moveToRelative(-0.706f, 0.707f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 2.71f, 3.417f)
                lineToRelative(2.79f, 2.79f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.283f)
                verticalLineTo(9.164f)
                horizontalLineToRelative(1.674f)
                close()
                moveTo(8.726f, 8.019f)
                lineTo(6.777f, 6.07f)
                verticalLineToRelative(-0.966f)
                horizontalLineTo(8.27f)
                curveToRelative(0.893f, 0.0f, 1.419f, 0.539f, 1.419f, 1.482f)
                curveToRelative(0.0f, 0.769f, -0.35f, 1.273f, -0.963f, 1.433f)
                moveToRelative(-1.949f, -0.534f)
                lineToRelative(0.59f, 0.59f)
                horizontalLineToRelative(-0.59f)
                close()
            }
        }
        .build()
        return _signNoParking!!
    }

private var _signNoParking: ImageVector? = null
