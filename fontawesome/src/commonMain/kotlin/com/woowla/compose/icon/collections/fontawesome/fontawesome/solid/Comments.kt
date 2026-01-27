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

public val SolidGroup.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 144.0f)
                curveToRelative(0.0f, 97.2f, -86.0f, 176.0f, -192.0f, 176.0f)
                curveToRelative(-26.7f, 0.0f, -52.1f, -5.0f, -75.2f, -14.0f)
                lineTo(35.2f, 349.2f)
                curveToRelative(-9.3f, 4.9f, -20.7f, 3.2f, -28.2f, -4.2f)
                reflectiveCurveToRelative(-9.2f, -18.9f, -4.2f, -28.2f)
                lineToRelative(35.6f, -67.2f)
                curveTo(14.3f, 220.2f, 0.0f, 183.6f, 0.0f, 144.0f)
                curveTo(0.0f, 46.8f, 86.0f, -32.0f, 192.0f, -32.0f)
                reflectiveCurveTo(384.0f, 46.8f, 384.0f, 144.0f)
                close()
                moveTo(384.0f, 512.0f)
                curveToRelative(-94.1f, 0.0f, -172.4f, -62.1f, -188.8f, -144.0f)
                curveToRelative(120.0f, -1.5f, 224.3f, -86.9f, 235.8f, -202.7f)
                curveToRelative(83.3f, 19.2f, 145.0f, 88.3f, 145.0f, 170.7f)
                curveToRelative(0.0f, 39.6f, -14.3f, 76.2f, -38.4f, 105.6f)
                lineToRelative(35.6f, 67.2f)
                curveToRelative(4.9f, 9.3f, 3.2f, 20.7f, -4.2f, 28.2f)
                reflectiveCurveToRelative(-18.9f, 9.2f, -28.2f, 4.2f)
                lineTo(459.2f, 498.0f)
                curveToRelative(-23.1f, 9.0f, -48.5f, 14.0f, -75.2f, 14.0f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
