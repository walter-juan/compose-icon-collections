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

public val SolidGroup.SimCard: ImageVector
    get() {
        if (_simCard != null) {
            return _simCard!!
        }
        _simCard = Builder(name = "SimCard", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                lineTo(242.7f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineTo(365.3f, 96.0f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineTo(384.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                close()
                moveTo(96.0f, 192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-32.0f, 0.0f)
                close()
                moveTo(64.0f, 352.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                close()
                moveTo(320.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                close()
                moveTo(160.0f, 192.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(288.0f, 448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(32.0f, 0.0f)
                close()
                moveTo(160.0f, 384.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(64.0f, 416.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _simCard!!
    }

private var _simCard: ImageVector? = null
