package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.H3: ImageVector
    get() {
        if (_h3 != null) {
            return _h3!!
        }
        _h3 = Builder(name = "H3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                lineTo(21.998f, 10.0f)
                lineTo(19.493f, 12.883f)
                curveTo(21.082f, 13.318f, 22.25f, 14.773f, 22.25f, 16.5f)
                curveTo(22.25f, 18.571f, 20.571f, 20.25f, 18.5f, 20.25f)
                curveTo(16.674f, 20.25f, 15.153f, 18.945f, 14.818f, 17.217f)
                lineTo(16.782f, 16.835f)
                curveTo(16.938f, 17.641f, 17.648f, 18.25f, 18.5f, 18.25f)
                curveTo(19.466f, 18.25f, 20.25f, 17.466f, 20.25f, 16.5f)
                curveTo(20.25f, 15.533f, 19.466f, 14.75f, 18.5f, 14.75f)
                curveTo(18.214f, 14.75f, 17.944f, 14.819f, 17.706f, 14.94f)
                lineTo(16.399f, 13.393f)
                lineTo(19.348f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _h3!!
    }

private var _h3: ImageVector? = null
