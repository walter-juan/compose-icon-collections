package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Orcid: ImageVector
    get() {
        if (_orcid != null) {
            return _orcid!!
        }
        _orcid = Builder(name = "Orcid", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(294.7f, 188.2f)
                lineToRelative(-45.9f, 0.0f)
                lineToRelative(0.0f, 153.8f)
                lineToRelative(47.5f, 0.0f)
                curveToRelative(67.6f, 0.0f, 83.1f, -51.3f, 83.1f, -76.9f)
                curveToRelative(0.0f, -41.6f, -26.5f, -76.9f, -84.7f, -76.9f)
                close()
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(175.2f, 368.8f)
                lineToRelative(-29.8f, 0.0f)
                lineToRelative(0.0f, -207.5f)
                lineToRelative(29.8f, 0.0f)
                lineToRelative(0.0f, 207.5f)
                close()
                moveTo(160.3f, 98.5f)
                arcToRelative(19.6f, 19.6f, 0.0f, true, true, 0.0f, 39.2f)
                arcToRelative(19.6f, 19.6f, 0.0f, true, true, 0.0f, -39.2f)
                close()
                moveTo(300.0f, 369.0f)
                lineToRelative(-81.0f, 0.0f)
                lineToRelative(0.0f, -207.7f)
                lineToRelative(80.6f, 0.0f)
                curveToRelative(76.7f, 0.0f, 110.4f, 54.8f, 110.4f, 103.9f)
                curveToRelative(0.0f, 53.3f, -41.7f, 103.9f, -110.0f, 103.9f)
                close()
            }
        }
        .build()
        return _orcid!!
    }

private var _orcid: ImageVector? = null
