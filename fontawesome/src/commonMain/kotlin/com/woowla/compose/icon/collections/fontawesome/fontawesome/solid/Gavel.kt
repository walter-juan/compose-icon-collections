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

public val SolidGroup.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.6f, 153.4f)
                lineToRelative(-18.7f, -18.7f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(265.6f, -25.4f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineTo(329.6f, -6.6f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                lineTo(214.9f, 153.4f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                close()
                moveTo(276.0f, 211.7f)
                lineToRelative(-31.4f, -31.4f)
                lineToRelative(112.0f, -112.0f)
                lineToRelative(119.4f, 119.4f)
                lineToRelative(-112.0f, 112.0f)
                lineToRelative(-31.4f, -31.4f)
                lineToRelative(-232.0f, 232.0f)
                curveToRelative(-15.6f, 15.6f, -40.9f, 15.6f, -56.6f, 0.0f)
                reflectiveCurveToRelative(-15.6f, -40.9f, 0.0f, -56.6f)
                lineToRelative(232.0f, -232.0f)
                close()
                moveTo(390.9f, 374.6f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(505.6f, 214.6f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(18.7f, 18.7f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                lineTo(454.9f, 393.4f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-18.7f, -18.7f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
