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

public val SolidGroup.ExternalLinkSquareAlt: ImageVector
    get() {
        if (_externalLinkSquareAlt != null) {
            return _externalLinkSquareAlt!!
        }
        _externalLinkSquareAlt = Builder(name = "ExternalLinkSquareAlt", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(320.0f, 0.0f)
                close()
                moveTo(168.0f, 160.0f)
                curveToRelative(-9.7f, 0.0f, -18.5f, 5.8f, -22.2f, 14.8f)
                reflectiveCurveToRelative(-1.7f, 19.3f, 5.2f, 26.2f)
                lineToRelative(35.0f, 35.0f)
                lineToRelative(-67.0f, 67.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(24.0f, 24.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(67.0f, -67.0f)
                lineToRelative(35.0f, 35.0f)
                curveToRelative(6.9f, 6.9f, 17.2f, 8.9f, 26.2f, 5.2f)
                reflectiveCurveTo(320.0f, 321.7f, 320.0f, 312.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-128.0f, 0.0f)
                close()
            }
        }
        .build()
        return _externalLinkSquareAlt!!
    }

private var _externalLinkSquareAlt: ImageVector? = null
