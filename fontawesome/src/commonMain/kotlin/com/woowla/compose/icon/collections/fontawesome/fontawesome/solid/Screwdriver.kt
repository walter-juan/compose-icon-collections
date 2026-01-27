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

public val SolidGroup.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.1f, 146.7f)
                lineToRelative(0.0f, -49.6f)
                curveToRelative(0.0f, -10.7f, 5.3f, -20.7f, 14.2f, -26.6f)
                lineTo(485.2f, -8.7f)
                curveToRelative(6.3f, -4.2f, 14.8f, -3.4f, 20.2f, 2.0f)
                lineToRelative(45.4f, 45.5f)
                curveToRelative(5.4f, 5.4f, 6.2f, 13.8f, 2.0f, 20.2f)
                lineTo(473.6f, 177.8f)
                curveToRelative(-5.9f, 8.9f, -15.9f, 14.2f, -26.6f, 14.2f)
                lineToRelative(-49.6f, 0.0f)
                lineToRelative(-90.7f, 90.7f)
                curveToRelative(15.0f, 33.3f, 8.9f, 73.9f, -18.5f, 101.3f)
                lineTo(162.1f, 510.1f)
                curveToRelative(-18.7f, 18.7f, -49.1f, 18.7f, -67.9f, 0.0f)
                lineTo(34.1f, 449.9f)
                curveToRelative(-18.7f, -18.7f, -18.7f, -49.1f, 0.0f, -67.9f)
                lineTo(160.1f, 256.0f)
                curveToRelative(27.4f, -27.4f, 67.9f, -33.6f, 101.3f, -18.5f)
                lineToRelative(90.7f, -90.7f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
