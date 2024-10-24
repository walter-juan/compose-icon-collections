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

public val EditorGroup.TranslateAi: ImageVector
    get() {
        if (_translateAi != null) {
            return _translateAi!!
        }
        _translateAi = Builder(name = "TranslateAi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.713f, 8.128f)
                lineTo(19.467f, 8.694f)
                curveTo(19.286f, 9.108f, 18.714f, 9.108f, 18.533f, 8.694f)
                lineTo(18.287f, 8.128f)
                curveTo(17.847f, 7.119f, 17.056f, 6.316f, 16.068f, 5.877f)
                lineTo(15.308f, 5.539f)
                curveTo(14.897f, 5.357f, 14.897f, 4.759f, 15.308f, 4.576f)
                lineTo(16.025f, 4.257f)
                curveTo(17.038f, 3.807f, 17.844f, 2.974f, 18.276f, 1.931f)
                lineTo(18.529f, 1.32f)
                curveTo(18.706f, 0.893f, 19.294f, 0.893f, 19.471f, 1.32f)
                lineTo(19.724f, 1.931f)
                curveTo(20.156f, 2.974f, 20.962f, 3.807f, 21.975f, 4.257f)
                lineTo(22.692f, 4.576f)
                curveTo(23.103f, 4.759f, 23.103f, 5.357f, 22.692f, 5.539f)
                lineTo(21.932f, 5.877f)
                curveTo(20.944f, 6.316f, 20.153f, 7.119f, 19.713f, 8.128f)
                close()
                moveTo(5.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 19.209f, 4.791f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                lineTo(6.851f, 18.994f)
                curveTo(5.816f, 18.918f, 5.0f, 18.054f, 5.0f, 17.0f)
                close()
                moveTo(22.4f, 21.0f)
                lineTo(18.0f, 10.0f)
                horizontalLineTo(16.0f)
                lineTo(11.601f, 21.0f)
                horizontalLineTo(13.755f)
                lineTo(14.954f, 18.0f)
                horizontalLineTo(19.044f)
                lineTo(20.245f, 21.0f)
                horizontalLineTo(22.4f)
                close()
                moveTo(15.753f, 16.0f)
                lineTo(17.0f, 12.885f)
                lineTo(18.245f, 16.0f)
                horizontalLineTo(15.753f)
                close()
                moveTo(8.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(4.0f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(8.0f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _translateAi!!
    }

private var _translateAi: ImageVector? = null
