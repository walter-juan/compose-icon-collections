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

public val BrandsGroup.HackerNews: ImageVector
    get() {
        if (_hackerNews != null) {
            return _hackerNews!!
        }
        _hackerNews = Builder(name = "HackerNews", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                lineToRelative(0.0f, 448.0f)
                lineToRelative(448.0f, 0.0f)
                lineToRelative(0.0f, -448.0f)
                lineToRelative(-448.0f, 0.0f)
                close()
                moveTo(21.2f, 229.2f)
                lineToRelative(-0.2f, 0.0f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.3f, 0.3f, -0.4f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.3f, -0.1f, 0.4f)
                close()
                moveTo(239.2f, 283.1f)
                lineToRelative(0.0f, 100.9f)
                lineToRelative(-31.4f, 0.0f)
                lineToRelative(0.0f, -102.7f)
                lineToRelative(-79.8f, -153.3f)
                lineToRelative(37.3f, 0.0f)
                curveToRelative(52.5f, 98.3f, 49.2f, 101.2f, 59.3f, 125.6f)
                curveToRelative(12.3f, -27.0f, 5.8f, -24.4f, 60.6f, -125.6f)
                lineToRelative(34.8f, 0.0f)
                lineToRelative(-80.8f, 155.1f)
                close()
            }
        }
        .build()
        return _hackerNews!!
    }

private var _hackerNews: ImageVector? = null
