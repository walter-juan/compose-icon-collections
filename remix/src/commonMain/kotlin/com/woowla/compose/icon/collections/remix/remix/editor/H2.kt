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

public val EditorGroup.H2: ImageVector
    get() {
        if (_h2 != null) {
            return _h2!!
        }
        _h2 = Builder(name = "H2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(18.5f, 8.0f)
                curveTo(20.571f, 8.0f, 22.25f, 9.679f, 22.25f, 11.75f)
                curveTo(22.25f, 12.607f, 21.962f, 13.398f, 21.478f, 14.029f)
                lineTo(21.33f, 14.21f)
                lineTo(18.034f, 18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                lineTo(14.999f, 18.444f)
                lineTo(19.821f, 12.898f)
                curveTo(20.088f, 12.591f, 20.25f, 12.189f, 20.25f, 11.75f)
                curveTo(20.25f, 10.783f, 19.466f, 10.0f, 18.5f, 10.0f)
                curveTo(17.582f, 10.0f, 16.829f, 10.707f, 16.756f, 11.606f)
                lineTo(16.75f, 11.75f)
                horizontalLineTo(14.75f)
                curveTo(14.75f, 9.679f, 16.429f, 8.0f, 18.5f, 8.0f)
                close()
            }
        }
        .build()
        return _h2!!
    }

private var _h2: ImageVector? = null
