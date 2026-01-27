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

public val SolidGroup.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(316.4f, -3.1f)
                curveToRelative(-16.8f, -12.2f, -39.6f, -12.2f, -56.4f, 0.0f)
                lineTo(35.3f, 160.2f)
                curveToRelative(-16.8f, 12.2f, -23.9f, 33.9f, -17.4f, 53.7f)
                lineToRelative(85.8f, 264.1f)
                curveToRelative(6.4f, 19.8f, 24.9f, 33.2f, 45.7f, 33.2f)
                lineToRelative(277.7f, 0.0f)
                curveToRelative(20.8f, 0.0f, 39.2f, -13.4f, 45.7f, -33.2f)
                lineToRelative(85.8f, -264.1f)
                curveToRelative(6.4f, -19.8f, -0.6f, -41.4f, -17.4f, -53.7f)
                lineTo(316.4f, -3.1f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
