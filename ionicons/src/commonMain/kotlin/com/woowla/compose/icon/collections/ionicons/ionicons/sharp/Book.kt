package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 48.0f)
                curveToRelative(-67.61f, 0.29f, -117.87f, 9.6f, -154.24f, 25.69f)
                curveTo(282.62f, 85.69f, 272.0f, 94.77f, 272.0f, 125.53f)
                verticalLineTo(448.0f)
                curveToRelative(41.57f, -37.5f, 78.46f, -48.0f, 224.0f, -48.0f)
                verticalLineTo(48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 48.0f)
                curveToRelative(67.61f, 0.29f, 117.87f, 9.6f, 154.24f, 25.69f)
                curveToRelative(27.14f, 12.0f, 37.76f, 21.08f, 37.76f, 51.84f)
                verticalLineTo(448.0f)
                curveToRelative(-41.57f, -37.5f, -78.46f, -48.0f, -224.0f, -48.0f)
                verticalLineTo(48.0f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
