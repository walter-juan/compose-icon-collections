package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.NewspaperLine: ImageVector
    get() {
        if (_newspaperLine != null) {
            return _newspaperLine!!
        }
        _newspaperLine = Builder(name = "NewspaperLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                curveTo(4.0f, 19.552f, 4.448f, 20.0f, 5.0f, 20.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 22.0f, 2.0f, 20.657f, 2.0f, 19.0f)
                verticalLineTo(3.0f)
                curveTo(2.0f, 2.448f, 2.448f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 2.0f, 18.0f, 2.448f, 18.0f, 3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 20.657f, 20.657f, 22.0f, 19.0f, 22.0f)
                close()
                moveTo(18.0f, 12.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 19.552f, 18.448f, 20.0f, 19.0f, 20.0f)
                curveTo(19.552f, 20.0f, 20.0f, 19.552f, 20.0f, 19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(6.0f, 16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _newspaperLine!!
    }

private var _newspaperLine: ImageVector? = null
