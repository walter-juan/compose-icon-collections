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

public val SolidGroup.HouseMedicalFlag: ImageVector
    get() {
        if (_houseMedicalFlag != null) {
            return _houseMedicalFlag!!
        }
        _houseMedicalFlag = Builder(name = "HouseMedicalFlag", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, 288.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -448.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(267.5f, 59.1f)
                lineTo(400.0f, 186.9f)
                lineTo(400.0f, 503.4f)
                curveToRelative(-9.4f, 5.4f, -20.3f, 8.6f, -32.0f, 8.6f)
                lineToRelative(-256.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -144.0f)
                lineToRelative(-19.9f, 0.0f)
                curveTo(12.6f, 304.0f, 0.0f, 291.4f, 0.0f, 275.9f)
                curveTo(0.0f, 268.3f, 3.1f, 261.0f, 8.6f, 255.7f)
                lineTo(212.5f, 59.1f)
                curveTo(219.9f, 52.0f, 229.7f, 48.0f, 240.0f, 48.0f)
                reflectiveCurveToRelative(20.1f, 4.0f, 27.5f, 11.1f)
                close()
                moveTo(204.8f, 256.8f)
                lineToRelative(0.0f, 44.0f)
                lineToRelative(-44.0f, 0.0f)
                curveToRelative(-9.7f, 0.0f, -17.6f, 7.9f, -17.6f, 17.6f)
                lineToRelative(0.0f, 35.2f)
                curveToRelative(0.0f, 9.7f, 7.9f, 17.6f, 17.6f, 17.6f)
                lineToRelative(44.0f, 0.0f)
                lineToRelative(0.0f, 44.0f)
                curveToRelative(0.0f, 9.7f, 7.9f, 17.6f, 17.6f, 17.6f)
                lineToRelative(35.2f, 0.0f)
                curveToRelative(9.7f, 0.0f, 17.6f, -7.9f, 17.6f, -17.6f)
                lineToRelative(0.0f, -44.0f)
                lineToRelative(44.0f, 0.0f)
                curveToRelative(9.7f, 0.0f, 17.6f, -7.9f, 17.6f, -17.6f)
                lineToRelative(0.0f, -35.2f)
                curveToRelative(0.0f, -9.7f, -7.9f, -17.6f, -17.6f, -17.6f)
                lineToRelative(-44.0f, 0.0f)
                lineToRelative(0.0f, -44.0f)
                curveToRelative(0.0f, -9.7f, -7.9f, -17.6f, -17.6f, -17.6f)
                lineToRelative(-35.2f, 0.0f)
                curveToRelative(-9.7f, 0.0f, -17.6f, 7.9f, -17.6f, 17.6f)
                close()
            }
        }
        .build()
        return _houseMedicalFlag!!
    }

private var _houseMedicalFlag: ImageVector? = null
