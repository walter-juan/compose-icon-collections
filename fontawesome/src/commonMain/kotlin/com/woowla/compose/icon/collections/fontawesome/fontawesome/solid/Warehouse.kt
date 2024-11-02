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

public val SolidGroup.Warehouse: ImageVector
    get() {
        if (_warehouse != null) {
            return _warehouse!!
        }
        _warehouse = Builder(name = "Warehouse", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 488.0f)
                lineTo(0.0f, 171.3f)
                curveToRelative(0.0f, -26.2f, 15.9f, -49.7f, 40.2f, -59.4f)
                lineTo(308.1f, 4.8f)
                curveToRelative(7.6f, -3.1f, 16.1f, -3.1f, 23.8f, 0.0f)
                lineTo(599.8f, 111.9f)
                curveToRelative(24.3f, 9.7f, 40.2f, 33.3f, 40.2f, 59.4f)
                lineTo(640.0f, 488.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -264.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-384.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 264.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                close()
                moveTo(488.0f, 512.0f)
                lineToRelative(-336.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -56.0f)
                lineToRelative(384.0f, 0.0f)
                lineToRelative(0.0f, 56.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(128.0f, 400.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(384.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-384.0f, 0.0f)
                close()
                moveTo(128.0f, 304.0f)
                lineToRelative(0.0f, -80.0f)
                lineToRelative(384.0f, 0.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(-384.0f, 0.0f)
                close()
            }
        }
        .build()
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
