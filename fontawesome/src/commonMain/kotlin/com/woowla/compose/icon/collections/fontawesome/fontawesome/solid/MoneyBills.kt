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

public val SolidGroup.MoneyBills: ImageVector
    get() {
        if (_moneyBills != null) {
            return _moneyBills!!
        }
        _moneyBills = Builder(name = "MoneyBills", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 32.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                lineToRelative(0.0f, 224.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(352.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -224.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(160.0f, 32.0f)
                close()
                moveTo(336.0f, 128.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                close()
                moveTo(160.0f, 152.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(4.4f, 0.0f, 8.1f, 3.6f, 7.5f, 8.0f)
                curveToRelative(-3.6f, 29.0f, -26.6f, 51.9f, -55.5f, 55.5f)
                curveToRelative(-4.4f, 0.5f, -8.0f, -3.1f, -8.0f, -7.5f)
                close()
                moveTo(160.0f, 264.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.1f, 8.0f, -7.5f)
                curveToRelative(29.0f, 3.6f, 51.9f, 26.6f, 55.5f, 55.5f)
                curveToRelative(0.5f, 4.4f, -3.1f, 8.0f, -7.5f, 8.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, -3.6f, -8.0f, -8.0f)
                lineToRelative(0.0f, -48.0f)
                close()
                moveTo(504.0f, 159.5f)
                curveToRelative(-29.0f, -3.6f, -51.9f, -26.6f, -55.5f, -55.5f)
                curveToRelative(-0.5f, -4.4f, 3.1f, -8.0f, 7.5f, -8.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.1f, -8.0f, 7.5f)
                close()
                moveTo(512.0f, 264.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-4.4f, 0.0f, -8.1f, -3.6f, -7.5f, -8.0f)
                curveToRelative(3.6f, -29.0f, 26.6f, -51.9f, 55.5f, -55.5f)
                curveToRelative(4.4f, -0.5f, 8.0f, 3.1f, 8.0f, 7.5f)
                close()
                moveTo(48.0f, 152.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveTo(0.0f, 138.7f, 0.0f, 152.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(392.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(64.0f, 432.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -264.0f)
                close()
            }
        }
        .build()
        return _moneyBills!!
    }

private var _moneyBills: ImageVector? = null
