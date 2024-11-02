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

public val Simpleicons.I18next: ImageVector
    get() {
        if (_i18next != null) {
            return _i18next!!
        }
        _i18next = Builder(name = "I18next", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.936f, 2.487f)
                verticalLineToRelative(4.517f)
                lineToRelative(5.076f, 13.036f)
                reflectiveCurveToRelative(1.549f, 3.184f, -2.882f, 3.96f)
                lineTo(7.019f, 24.0f)
                reflectiveCurveToRelative(-4.131f, -0.431f, -3.141f, -3.702f)
                lineTo(9.213f, 7.004f)
                lineTo(9.213f, 2.487f)
                horizontalLineToRelative(5.724f)
                close()
                moveTo(17.026f, 15.595f)
                curveToRelative(-4.43f, -1.374f, -8.155f, -0.637f, -9.975f, -0.079f)
                lineToRelative(-1.836f, 4.419f)
                curveToRelative(-0.783f, 2.499f, 2.273f, 2.942f, 2.597f, 2.981f)
                lineToRelative(0.028f, 0.003f)
                horizontalLineToRelative(8.444f)
                curveToRelative(3.541f, -0.598f, 2.511f, -2.972f, 2.415f, -3.177f)
                lineToRelative(-0.007f, -0.014f)
                lineToRelative(-1.666f, -4.133f)
                close()
                moveTo(9.212f, 16.372f)
                curveToRelative(0.789f, 0.0f, 1.429f, 0.386f, 1.429f, 0.865f)
                curveToRelative(0.0f, 0.476f, -0.64f, 0.864f, -1.429f, 0.864f)
                curveToRelative(-0.789f, 0.0f, -1.427f, -0.388f, -1.427f, -0.864f)
                curveToRelative(0.0f, -0.478f, 0.638f, -0.865f, 1.427f, -0.865f)
                close()
                moveTo(14.296f, 16.372f)
                curveToRelative(0.787f, 0.0f, 1.427f, 0.386f, 1.427f, 0.865f)
                curveToRelative(0.0f, 0.476f, -0.64f, 0.864f, -1.427f, 0.864f)
                curveToRelative(-0.791f, 0.0f, -1.429f, -0.388f, -1.429f, -0.864f)
                curveToRelative(0.0f, -0.478f, 0.638f, -0.865f, 1.429f, -0.865f)
                close()
                moveTo(9.796f, 11.159f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.539f, -1.0f, 1.205f)
                curveToRelative(0.0f, 0.666f, 0.448f, 1.205f, 1.0f, 1.205f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.539f, 1.0f, -1.205f)
                curveToRelative(0.0f, -0.666f, -0.448f, -1.205f, -1.0f, -1.205f)
                close()
                moveTo(13.437f, 9.862f)
                curveToRelative(-0.655f, 0.0f, -1.186f, 0.638f, -1.186f, 1.429f)
                curveToRelative(0.0f, 0.787f, 0.531f, 1.427f, 1.186f, 1.427f)
                curveToRelative(0.653f, 0.0f, 1.186f, -0.64f, 1.186f, -1.427f)
                curveToRelative(0.0f, -0.791f, -0.533f, -1.429f, -1.186f, -1.429f)
                close()
                moveTo(19.474f, 7.124f)
                reflectiveCurveToRelative(-2.122f, 1.546f, -4.086f, -0.42f)
                lineTo(15.388f, 4.556f)
                reflectiveCurveToRelative(2.724f, -0.601f, 4.086f, 2.568f)
                close()
                moveTo(4.63f, 7.124f)
                curveTo(5.991f, 3.955f, 8.715f, 4.556f, 8.715f, 4.556f)
                verticalLineToRelative(2.148f)
                curveToRelative(-1.966f, 1.966f, -4.085f, 0.42f, -4.085f, 0.42f)
                close()
                moveTo(15.044f, 0.0f)
                curveToRelative(0.495f, 0.0f, 0.896f, 0.439f, 0.896f, 0.981f)
                curveToRelative(0.0f, 0.542f, -0.401f, 0.981f, -0.896f, 0.981f)
                lineTo(8.955f, 1.962f)
                curveToRelative(-0.493f, 0.0f, -0.894f, -0.439f, -0.894f, -0.981f)
                curveTo(8.061f, 0.439f, 8.461f, 0.0f, 8.955f, 0.0f)
                horizontalLineToRelative(6.089f)
                close()
            }
        }
        .build()
        return _i18next!!
    }

private var _i18next: ImageVector? = null
