package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.2f, 0.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 62.1f)
                lineToRelative(-15.0f, -15.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(49.0f, 49.0f)
                lineToRelative(0.0f, 70.6f)
                lineToRelative(-61.2f, -35.3f)
                lineToRelative(-17.9f, -66.9f)
                curveToRelative(-3.4f, -12.8f, -16.6f, -20.4f, -29.4f, -17.0f)
                reflectiveCurveTo(95.3f, 98.0f, 98.7f, 110.8f)
                lineToRelative(5.5f, 20.5f)
                lineToRelative(-53.7f, -31.0f)
                curveTo(35.2f, 91.5f, 15.6f, 96.7f, 6.8f, 112.0f)
                reflectiveCurveToRelative(-3.6f, 34.9f, 11.7f, 43.7f)
                lineToRelative(53.7f, 31.0f)
                lineToRelative(-20.5f, 5.5f)
                curveToRelative(-12.8f, 3.4f, -20.4f, 16.6f, -17.0f, 29.4f)
                reflectiveCurveToRelative(16.6f, 20.4f, 29.4f, 17.0f)
                lineToRelative(66.9f, -17.9f)
                lineToRelative(61.2f, 35.3f)
                lineToRelative(-61.2f, 35.3f)
                lineToRelative(-66.9f, -17.9f)
                curveToRelative(-12.8f, -3.4f, -26.0f, 4.2f, -29.4f, 17.0f)
                reflectiveCurveToRelative(4.2f, 26.0f, 17.0f, 29.4f)
                lineToRelative(20.5f, 5.5f)
                lineToRelative(-53.7f, 31.0f)
                curveTo(3.2f, 365.1f, -2.0f, 384.7f, 6.8f, 400.0f)
                reflectiveCurveToRelative(28.4f, 20.6f, 43.7f, 11.7f)
                lineToRelative(53.7f, -31.0f)
                lineToRelative(-5.5f, 20.5f)
                curveToRelative(-3.4f, 12.8f, 4.2f, 26.0f, 17.0f, 29.4f)
                reflectiveCurveToRelative(26.0f, -4.2f, 29.4f, -17.0f)
                lineToRelative(17.9f, -66.9f)
                lineToRelative(61.2f, -35.3f)
                lineToRelative(0.0f, 70.6f)
                lineToRelative(-49.0f, 49.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(0.0f, 62.1f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -62.1f)
                lineToRelative(15.0f, 15.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-49.0f, -49.0f)
                lineToRelative(0.0f, -70.6f)
                lineToRelative(61.2f, 35.3f)
                lineToRelative(17.9f, 66.9f)
                curveToRelative(3.4f, 12.8f, 16.6f, 20.4f, 29.4f, 17.0f)
                reflectiveCurveToRelative(20.4f, -16.6f, 17.0f, -29.4f)
                lineToRelative(-5.5f, -20.5f)
                lineToRelative(53.7f, 31.0f)
                curveToRelative(15.3f, 8.8f, 34.9f, 3.6f, 43.7f, -11.7f)
                reflectiveCurveToRelative(3.6f, -34.9f, -11.7f, -43.7f)
                lineToRelative(-53.7f, -31.0f)
                lineToRelative(20.5f, -5.5f)
                curveToRelative(12.8f, -3.4f, 20.4f, -16.6f, 17.0f, -29.4f)
                reflectiveCurveToRelative(-16.6f, -20.4f, -29.4f, -17.0f)
                lineToRelative(-66.9f, 17.9f)
                lineToRelative(-61.2f, -35.3f)
                lineToRelative(61.2f, -35.3f)
                lineToRelative(66.9f, 17.9f)
                curveToRelative(12.8f, 3.4f, 26.0f, -4.2f, 29.4f, -17.0f)
                reflectiveCurveToRelative(-4.2f, -26.0f, -17.0f, -29.4f)
                lineToRelative(-20.5f, -5.5f)
                lineToRelative(53.7f, -31.0f)
                curveToRelative(15.3f, -8.8f, 20.6f, -28.4f, 11.7f, -43.7f)
                reflectiveCurveToRelative(-28.4f, -20.5f, -43.7f, -11.7f)
                lineToRelative(-53.7f, 31.0f)
                lineToRelative(5.5f, -20.5f)
                curveToRelative(3.4f, -12.8f, -4.2f, -26.0f, -17.0f, -29.4f)
                reflectiveCurveToRelative(-26.0f, 4.2f, -29.4f, 17.0f)
                lineToRelative(-17.9f, 66.9f)
                lineToRelative(-61.2f, 35.3f)
                lineToRelative(0.0f, -70.6f)
                lineToRelative(49.0f, -49.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(-24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-15.0f, 15.0f)
                lineToRelative(0.0f, -62.1f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
