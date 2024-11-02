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

public val SolidGroup.MoneyBill1: ImageVector
    get() {
        if (_moneyBill1 != null) {
            return _moneyBill1!!
        }
        _moneyBill1 = Builder(name = "MoneyBill1", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                curveTo(28.7f, 64.0f, 0.0f, 92.7f, 0.0f, 128.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(448.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(128.0f, 384.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                close()
                moveTo(64.0f, 192.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                close()
                moveTo(448.0f, 384.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(512.0f, 192.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                close()
                moveTo(176.0f, 256.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, 224.0f, 0.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, -224.0f, 0.0f)
                close()
                moveTo(252.0f, 208.0f)
                curveToRelative(0.0f, 9.7f, 6.9f, 17.7f, 16.0f, 19.6f)
                lineToRelative(0.0f, 48.4f)
                lineToRelative(-4.0f, 0.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, 9.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(9.0f, 20.0f, 20.0f, 20.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(24.0f, 0.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, -9.0f, 20.0f, -20.0f)
                reflectiveCurveToRelative(-9.0f, -20.0f, -20.0f, -20.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, -68.0f)
                curveToRelative(0.0f, -11.0f, -9.0f, -20.0f, -20.0f, -20.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, 9.0f, -20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _moneyBill1!!
    }

private var _moneyBill1: ImageVector? = null
