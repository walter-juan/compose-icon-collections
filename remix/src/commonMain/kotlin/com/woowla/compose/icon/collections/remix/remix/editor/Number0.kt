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

public val EditorGroup.Number0: ImageVector
    get() {
        if (_number0 != null) {
            return _number0!!
        }
        _number0 = Builder(name = "Number0", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                curveTo(13.321f, 1.5f, 14.484f, 1.848f, 15.447f, 2.494f)
                curveTo(16.41f, 3.139f, 17.173f, 4.082f, 17.696f, 5.272f)
                curveTo(18.218f, 6.461f, 18.5f, 7.897f, 18.5f, 9.529f)
                verticalLineTo(14.471f)
                curveTo(18.5f, 16.103f, 18.218f, 17.539f, 17.696f, 18.728f)
                curveTo(17.173f, 19.918f, 16.41f, 20.861f, 15.447f, 21.506f)
                curveTo(14.484f, 22.152f, 13.321f, 22.5f, 12.0f, 22.5f)
                curveTo(10.679f, 22.5f, 9.516f, 22.152f, 8.553f, 21.506f)
                curveTo(7.59f, 20.861f, 6.827f, 19.918f, 6.304f, 18.728f)
                curveTo(5.782f, 17.539f, 5.5f, 16.103f, 5.5f, 14.471f)
                verticalLineTo(9.529f)
                curveTo(5.5f, 7.897f, 5.782f, 6.461f, 6.304f, 5.272f)
                curveTo(6.827f, 4.082f, 7.59f, 3.139f, 8.553f, 2.494f)
                curveTo(9.516f, 1.848f, 10.679f, 1.5f, 12.0f, 1.5f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(11.084f, 3.5f, 10.306f, 3.726f, 9.667f, 4.155f)
                curveTo(9.03f, 4.582f, 8.509f, 5.225f, 8.135f, 6.076f)
                curveTo(7.723f, 7.015f, 7.5f, 8.183f, 7.5f, 9.529f)
                verticalLineTo(14.471f)
                curveTo(7.5f, 15.817f, 7.723f, 16.985f, 8.135f, 17.924f)
                curveTo(8.509f, 18.775f, 9.03f, 19.418f, 9.667f, 19.845f)
                curveTo(10.306f, 20.274f, 11.084f, 20.5f, 12.0f, 20.5f)
                curveTo(12.916f, 20.5f, 13.694f, 20.274f, 14.333f, 19.845f)
                curveTo(14.97f, 19.418f, 15.491f, 18.775f, 15.865f, 17.924f)
                curveTo(16.277f, 16.985f, 16.5f, 15.817f, 16.5f, 14.471f)
                verticalLineTo(9.529f)
                curveTo(16.5f, 8.183f, 16.277f, 7.015f, 15.865f, 6.076f)
                curveTo(15.491f, 5.225f, 14.97f, 4.582f, 14.333f, 4.155f)
                curveTo(13.694f, 3.726f, 12.916f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return _number0!!
    }

private var _number0: ImageVector? = null
