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

public val DocumentGroup.FileAi2Line: ImageVector
    get() {
        if (_fileAi2Line != null) {
            return _fileAi2Line!!
        }
        _fileAi2Line = Builder(name = "FileAi2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.529f, 15.319f)
                curveTo(18.706f, 14.894f, 19.294f, 14.894f, 19.471f, 15.319f)
                lineTo(19.724f, 15.931f)
                curveTo(20.156f, 16.973f, 20.962f, 17.806f, 21.975f, 18.257f)
                lineTo(22.692f, 18.576f)
                curveTo(23.103f, 18.759f, 23.103f, 19.356f, 22.692f, 19.539f)
                lineTo(21.933f, 19.877f)
                curveTo(20.945f, 20.316f, 20.153f, 21.119f, 19.714f, 22.128f)
                lineTo(19.467f, 22.693f)
                curveTo(19.286f, 23.108f, 18.714f, 23.108f, 18.533f, 22.693f)
                lineTo(18.287f, 22.128f)
                curveTo(17.848f, 21.119f, 17.055f, 20.316f, 16.067f, 19.877f)
                lineTo(15.308f, 19.539f)
                curveTo(14.897f, 19.356f, 14.897f, 18.759f, 15.308f, 18.576f)
                lineTo(16.025f, 18.257f)
                curveTo(17.038f, 17.806f, 17.844f, 16.973f, 18.276f, 15.931f)
                lineTo(18.529f, 15.319f)
                close()
                moveTo(19.998f, 2.0f)
                curveTo(20.551f, 2.0f, 21.0f, 2.456f, 21.0f, 2.992f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.55f, 3.0f, 20.993f)
                verticalLineTo(8.0f)
                lineTo(9.003f, 2.0f)
                horizontalLineTo(19.998f)
                close()
            }
        }
        .build()
        return _fileAi2Line!!
    }

private var _fileAi2Line: ImageVector? = null
