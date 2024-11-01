package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.DvdAiFill: ImageVector
    get() {
        if (_dvdAiFill != null) {
            return _dvdAiFill!!
        }
        _dvdAiFill = Builder(name = "DvdAiFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.467f, 8.694f)
                lineTo(20.713f, 8.128f)
                curveTo(21.153f, 7.119f, 21.944f, 6.316f, 22.932f, 5.877f)
                lineTo(23.692f, 5.539f)
                curveTo(24.103f, 5.357f, 24.103f, 4.759f, 23.692f, 4.576f)
                lineTo(22.975f, 4.257f)
                curveTo(21.962f, 3.807f, 21.156f, 2.974f, 20.724f, 1.931f)
                lineTo(20.471f, 1.32f)
                curveTo(20.294f, 0.893f, 19.706f, 0.893f, 19.529f, 1.32f)
                lineTo(19.276f, 1.931f)
                curveTo(18.844f, 2.974f, 18.038f, 3.807f, 17.025f, 4.257f)
                lineTo(16.308f, 4.576f)
                curveTo(15.897f, 4.759f, 15.897f, 5.357f, 16.308f, 5.539f)
                lineTo(17.068f, 5.877f)
                curveTo(18.056f, 6.316f, 18.847f, 7.119f, 19.287f, 8.128f)
                lineTo(19.533f, 8.694f)
                curveTo(19.714f, 9.108f, 20.286f, 9.108f, 20.467f, 8.694f)
                close()
                moveTo(20.0f, 11.0f)
                curveTo(20.67f, 11.0f, 21.313f, 10.89f, 21.915f, 10.688f)
                curveTo(21.971f, 11.117f, 22.0f, 11.555f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(12.906f, 2.0f, 13.783f, 2.12f, 14.617f, 2.346f)
                curveTo(14.222f, 3.146f, 14.0f, 4.047f, 14.0f, 5.0f)
                curveTo(14.0f, 8.314f, 16.686f, 11.0f, 20.0f, 11.0f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineTo(6.0f)
                lineTo(8.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                lineTo(16.0f, 11.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _dvdAiFill!!
    }

private var _dvdAiFill: ImageVector? = null
