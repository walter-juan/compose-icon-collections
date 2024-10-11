package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.SeedlingLine: ImageVector
    get() {
        if (_seedlingLine != null) {
            return _seedlingLine!!
        }
        _seedlingLine = Builder(name = "SeedlingLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.998f, 3.0f)
                curveTo(9.488f, 3.0f, 12.381f, 5.554f, 12.911f, 8.894f)
                curveTo(14.086f, 7.724f, 15.708f, 7.0f, 17.498f, 7.0f)
                horizontalLineTo(21.998f)
                verticalLineTo(9.5f)
                curveTo(21.998f, 13.09f, 19.088f, 16.0f, 15.498f, 16.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.998f)
                curveTo(5.132f, 13.0f, 1.998f, 9.866f, 1.998f, 6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.998f)
                close()
                moveTo(19.998f, 9.0f)
                horizontalLineTo(17.498f)
                curveTo(15.013f, 9.0f, 12.998f, 11.015f, 12.998f, 13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.498f)
                curveTo(17.983f, 14.0f, 19.998f, 11.985f, 19.998f, 9.5f)
                verticalLineTo(9.0f)
                close()
                moveTo(5.998f, 5.0f)
                horizontalLineTo(3.998f)
                verticalLineTo(6.0f)
                curveTo(3.998f, 8.761f, 6.237f, 11.0f, 8.998f, 11.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(10.0f)
                curveTo(10.998f, 7.239f, 8.759f, 5.0f, 5.998f, 5.0f)
                close()
            }
        }
        .build()
        return _seedlingLine!!
    }

private var _seedlingLine: ImageVector? = null
