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

public val DocumentGroup.Folder5Line: ImageVector
    get() {
        if (_folder5Line != null) {
            return _folder5Line!!
        }
        _folder5Line = Builder(name = "Folder5Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.087f, 9.0f)
                horizontalLineTo(20.913f)
                curveTo(21.466f, 9.0f, 21.913f, 9.448f, 21.913f, 10.0f)
                curveTo(21.913f, 10.028f, 21.912f, 10.055f, 21.91f, 10.083f)
                lineTo(21.077f, 20.083f)
                curveTo(21.033f, 20.601f, 20.6f, 21.0f, 20.08f, 21.0f)
                horizontalLineTo(3.92f)
                curveTo(3.4f, 21.0f, 2.967f, 20.601f, 2.924f, 20.083f)
                lineTo(2.09f, 10.083f)
                curveTo(2.045f, 9.533f, 2.454f, 9.049f, 3.004f, 9.003f)
                curveTo(3.032f, 9.001f, 3.059f, 9.0f, 3.087f, 9.0f)
                close()
                moveTo(4.84f, 19.0f)
                horizontalLineTo(19.16f)
                lineTo(19.827f, 11.0f)
                horizontalLineTo(4.174f)
                lineTo(4.84f, 19.0f)
                close()
                moveTo(13.414f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 5.0f, 21.0f, 5.448f, 21.0f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(11.414f)
                lineTo(13.414f, 5.0f)
                close()
            }
        }
        .build()
        return _folder5Line!!
    }

private var _folder5Line: ImageVector? = null
