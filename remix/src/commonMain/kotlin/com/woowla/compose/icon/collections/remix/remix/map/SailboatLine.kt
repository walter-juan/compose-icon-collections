package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.SailboatLine: ImageVector
    get() {
        if (_sailboatLine != null) {
            return _sailboatLine!!
        }
        _sailboatLine = Builder(name = "SailboatLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                horizontalLineTo(21.0f)
                curveTo(21.276f, 18.0f, 21.5f, 18.224f, 21.5f, 18.5f)
                curveTo(21.5f, 18.608f, 21.465f, 18.713f, 21.4f, 18.8f)
                lineTo(19.3f, 21.6f)
                curveTo(19.111f, 21.852f, 18.815f, 22.0f, 18.5f, 22.0f)
                horizontalLineTo(5.5f)
                curveTo(5.185f, 22.0f, 4.889f, 21.852f, 4.7f, 21.6f)
                lineTo(2.6f, 18.8f)
                curveTo(2.434f, 18.579f, 2.479f, 18.266f, 2.7f, 18.1f)
                curveTo(2.787f, 18.035f, 2.892f, 18.0f, 3.0f, 18.0f)
                close()
                moveTo(7.161f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.702f)
                lineTo(7.161f, 14.0f)
                close()
                moveTo(15.0f, 2.425f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 15.552f, 14.552f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(4.04f)
                curveTo(3.764f, 16.0f, 3.54f, 15.776f, 3.54f, 15.5f)
                curveTo(3.54f, 15.387f, 3.579f, 15.276f, 3.65f, 15.188f)
                lineTo(14.11f, 2.113f)
                curveTo(14.282f, 1.897f, 14.597f, 1.862f, 14.812f, 2.035f)
                curveTo(14.931f, 2.13f, 15.0f, 2.274f, 15.0f, 2.425f)
                close()
            }
        }
        .build()
        return _sailboatLine!!
    }

private var _sailboatLine: ImageVector? = null
