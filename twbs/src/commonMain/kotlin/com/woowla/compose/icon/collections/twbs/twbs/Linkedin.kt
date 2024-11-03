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

public val Twbs.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(name = "Linkedin", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.146f)
                curveTo(0.0f, 0.513f, 0.526f, 0.0f, 1.175f, 0.0f)
                horizontalLineToRelative(13.65f)
                curveTo(15.474f, 0.0f, 16.0f, 0.513f, 16.0f, 1.146f)
                verticalLineToRelative(13.708f)
                curveToRelative(0.0f, 0.633f, -0.526f, 1.146f, -1.175f, 1.146f)
                lineTo(1.175f, 16.0f)
                curveTo(0.526f, 16.0f, 0.0f, 15.487f, 0.0f, 14.854f)
                close()
                moveTo(4.943f, 13.394f)
                lineTo(4.943f, 6.169f)
                lineTo(2.542f, 6.169f)
                verticalLineToRelative(7.225f)
                close()
                moveTo(3.743f, 5.182f)
                curveToRelative(0.837f, 0.0f, 1.358f, -0.554f, 1.358f, -1.248f)
                curveToRelative(-0.015f, -0.709f, -0.52f, -1.248f, -1.342f, -1.248f)
                reflectiveCurveTo(2.4f, 3.226f, 2.4f, 3.934f)
                curveToRelative(0.0f, 0.694f, 0.521f, 1.248f, 1.327f, 1.248f)
                close()
                moveTo(8.651f, 13.394f)
                lineTo(8.651f, 9.359f)
                curveToRelative(0.0f, -0.216f, 0.016f, -0.432f, 0.08f, -0.586f)
                curveToRelative(0.173f, -0.431f, 0.568f, -0.878f, 1.232f, -0.878f)
                curveToRelative(0.869f, 0.0f, 1.216f, 0.662f, 1.216f, 1.634f)
                verticalLineToRelative(3.865f)
                horizontalLineToRelative(2.401f)
                lineTo(13.58f, 9.25f)
                curveToRelative(0.0f, -2.22f, -1.184f, -3.252f, -2.764f, -3.252f)
                curveToRelative(-1.274f, 0.0f, -1.845f, 0.7f, -2.165f, 1.193f)
                verticalLineToRelative(0.025f)
                horizontalLineToRelative(-0.016f)
                lineToRelative(0.016f, -0.025f)
                lineTo(8.651f, 6.169f)
                horizontalLineToRelative(-2.4f)
                curveToRelative(0.03f, 0.678f, 0.0f, 7.225f, 0.0f, 7.225f)
                close()
            }
        }
        .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
