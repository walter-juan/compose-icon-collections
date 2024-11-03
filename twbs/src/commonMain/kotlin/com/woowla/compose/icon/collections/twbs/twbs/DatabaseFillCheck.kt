package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.DatabaseFillCheck: ImageVector
    get() {
        if (_databaseFillCheck != null) {
            return _databaseFillCheck!!
        }
        _databaseFillCheck = Builder(name = "DatabaseFillCheck", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 16.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                moveToRelative(1.679f, -4.493f)
                lineToRelative(-1.335f, 2.226f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.174f, 0.144f)
                lineToRelative(-0.774f, -0.773f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, -0.708f)
                lineToRelative(0.547f, 0.548f)
                lineToRelative(1.17f, -1.951f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.858f, 0.514f)
                moveTo(8.0f, 1.0f)
                curveToRelative(-1.573f, 0.0f, -3.022f, 0.289f, -4.096f, 0.777f)
                curveTo(2.875f, 2.245f, 2.0f, 2.993f, 2.0f, 4.0f)
                reflectiveCurveToRelative(0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 6.711f, 6.427f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                curveTo(13.125f, 5.755f, 14.0f, 5.007f, 14.0f, 4.0f)
                reflectiveCurveToRelative(-0.875f, -1.755f, -1.904f, -2.223f)
                curveTo(11.022f, 1.289f, 9.573f, 1.0f, 8.0f, 1.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                verticalLineToRelative(-0.839f)
                curveToRelative(0.457f, 0.432f, 1.004f, 0.751f, 1.49f, 0.972f)
                curveTo(4.722f, 7.693f, 6.318f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(3.278f, -0.307f, 4.51f, -0.867f)
                curveToRelative(0.486f, -0.22f, 1.033f, -0.54f, 1.49f, -0.972f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, 0.424f, -0.155f, 0.802f, -0.411f, 1.133f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, false, -4.815f, 1.843f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 8.0f, 10.0f)
                curveToRelative(-1.573f, 0.0f, -3.022f, -0.289f, -4.096f, -0.777f)
                curveTo(2.875f, 8.755f, 2.0f, 8.007f, 2.0f, 7.0f)
                moveToRelative(6.257f, 3.998f)
                lineTo(8.0f, 11.0f)
                curveToRelative(-1.682f, 0.0f, -3.278f, -0.307f, -4.51f, -0.867f)
                curveToRelative(-0.486f, -0.22f, -1.033f, -0.54f, -1.49f, -0.972f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 12.711f, 6.427f, 13.0f, 8.0f, 13.0f)
                horizontalLineToRelative(0.027f)
                arcToRelative(4.55f, 4.55f, 0.0f, false, true, 0.23f, -2.002f)
                moveToRelative(-0.002f, 3.0f)
                lineTo(8.0f, 14.0f)
                curveToRelative(-1.682f, 0.0f, -3.278f, -0.307f, -4.51f, -0.867f)
                curveToRelative(-0.486f, -0.22f, -1.033f, -0.54f, -1.49f, -0.972f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 15.711f, 6.427f, 16.0f, 8.0f, 16.0f)
                curveToRelative(0.536f, 0.0f, 1.058f, -0.034f, 1.555f, -0.097f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.3f, -1.905f)
            }
        }
        .build()
        return _databaseFillCheck!!
    }

private var _databaseFillCheck: ImageVector? = null
