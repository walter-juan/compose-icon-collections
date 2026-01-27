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

public val SolidGroup.MoneyBill: ImageVector
    get() {
        if (_moneyBill != null) {
            return _moneyBill!!
        }
        _moneyBill = Builder(name = "MoneyBill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                curveTo(28.7f, 64.0f, 0.0f, 92.7f, 0.0f, 128.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(256.0f, 160.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, 192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, -192.0f)
                close()
                moveTo(448.0f, 184.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.1f, -8.0f, 7.5f)
                curveToRelative(-29.0f, -3.6f, -51.9f, -26.6f, -55.5f, -55.5f)
                curveToRelative(-0.5f, -4.4f, 3.1f, -8.0f, 7.5f, -8.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                lineToRelative(0.0f, 48.0f)
                close()
                moveTo(64.0f, 328.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.1f, 8.0f, -7.5f)
                curveToRelative(29.0f, 3.6f, 51.9f, 26.6f, 55.5f, 55.5f)
                curveToRelative(0.5f, 4.4f, -3.1f, 8.0f, -7.5f, 8.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, -3.6f, -8.0f, -8.0f)
                lineToRelative(0.0f, -48.0f)
                close()
                moveTo(72.0f, 191.5f)
                curveToRelative(-4.4f, 0.5f, -8.0f, -3.1f, -8.0f, -7.5f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(4.4f, 0.0f, 8.1f, 3.6f, 7.5f, 8.0f)
                curveToRelative(-3.6f, 29.0f, -26.6f, 51.9f, -55.5f, 55.5f)
                close()
                moveTo(440.0f, 320.5f)
                curveToRelative(4.4f, -0.5f, 8.0f, 3.1f, 8.0f, 7.5f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-4.4f, 0.0f, -8.1f, -3.6f, -7.5f, -8.0f)
                curveToRelative(3.6f, -29.0f, 26.6f, -51.9f, 55.5f, -55.5f)
                close()
            }
        }
        .build()
        return _moneyBill!!
    }

private var _moneyBill: ImageVector? = null
