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

public val SolidGroup.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 240.0f)
                curveToRelative(0.0f, 132.5f, -114.6f, 240.0f, -256.0f, 240.0f)
                curveToRelative(-37.1f, 0.0f, -72.3f, -7.4f, -104.1f, -20.7f)
                lineTo(33.5f, 510.1f)
                curveToRelative(-9.4f, 4.0f, -20.2f, 1.7f, -27.1f, -5.8f)
                reflectiveCurveTo(-2.0f, 485.8f, 2.8f, 476.8f)
                lineToRelative(48.8f, -92.2f)
                curveTo(19.2f, 344.3f, 0.0f, 294.3f, 0.0f, 240.0f)
                curveTo(0.0f, 107.5f, 114.6f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(512.0f, 107.5f, 512.0f, 240.0f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
