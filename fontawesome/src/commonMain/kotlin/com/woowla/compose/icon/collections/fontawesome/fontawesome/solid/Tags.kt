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

public val SolidGroup.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(401.2f, 39.1f)
                lineTo(549.4f, 189.4f)
                curveToRelative(27.7f, 28.1f, 27.7f, 73.1f, 0.0f, 101.2f)
                lineTo(393.0f, 448.9f)
                curveToRelative(-9.3f, 9.4f, -24.5f, 9.5f, -33.9f, 0.2f)
                reflectiveCurveToRelative(-9.5f, -24.5f, -0.2f, -33.9f)
                lineTo(515.3f, 256.8f)
                curveToRelative(9.2f, -9.3f, 9.2f, -24.4f, 0.0f, -33.7f)
                lineTo(367.0f, 72.9f)
                curveToRelative(-9.3f, -9.4f, -9.2f, -24.6f, 0.2f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.2f, 33.9f, 0.2f)
                close()
                moveTo(32.1f, 229.5f)
                lineTo(32.1f, 96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(133.5f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineToRelative(144.0f, 144.0f)
                curveToRelative(25.0f, 25.0f, 25.0f, 65.5f, 0.0f, 90.5f)
                lineTo(285.4f, 418.7f)
                curveToRelative(-25.0f, 25.0f, -65.5f, 25.0f, -90.5f, 0.0f)
                lineToRelative(-144.0f, -144.0f)
                curveToRelative(-12.0f, -12.0f, -18.7f, -28.3f, -18.7f, -45.3f)
                close()
                moveTo(176.1f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
