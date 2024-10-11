package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.BugLine: ImageVector
    get() {
        if (_bugLine != null) {
            return _bugLine!!
        }
        _bugLine = Builder(name = "BugLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.9f)
                curveTo(15.282f, 19.437f, 17.0f, 17.419f, 17.0f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 11.299f, 16.856f, 10.622f, 16.585f, 10.0f)
                horizontalLineTo(7.415f)
                curveTo(7.144f, 10.622f, 7.0f, 11.299f, 7.0f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(7.0f, 17.419f, 8.718f, 19.437f, 11.0f, 19.9f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.9f)
                close()
                moveTo(5.536f, 17.691f)
                curveTo(5.191f, 16.862f, 5.0f, 15.953f, 5.0f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 11.357f, 5.087f, 10.735f, 5.249f, 10.144f)
                lineTo(3.036f, 8.866f)
                lineTo(4.036f, 7.134f)
                lineTo(6.056f, 8.3f)
                curveTo(6.12f, 8.199f, 6.186f, 8.098f, 6.255f, 8.0f)
                horizontalLineTo(17.745f)
                curveTo(17.814f, 8.098f, 17.88f, 8.199f, 17.944f, 8.3f)
                lineTo(19.964f, 7.134f)
                lineTo(20.964f, 8.866f)
                lineTo(18.751f, 10.144f)
                curveTo(18.913f, 10.735f, 19.0f, 11.357f, 19.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 15.953f, 18.809f, 16.862f, 18.464f, 17.691f)
                lineTo(20.964f, 19.134f)
                lineTo(19.964f, 20.866f)
                lineTo(17.438f, 19.408f)
                curveTo(16.155f, 20.989f, 14.196f, 22.0f, 12.0f, 22.0f)
                curveTo(9.805f, 22.0f, 7.845f, 20.989f, 6.562f, 19.408f)
                lineTo(4.036f, 20.866f)
                lineTo(3.036f, 19.134f)
                lineTo(5.536f, 17.691f)
                close()
                moveTo(8.0f, 6.0f)
                curveTo(8.0f, 3.791f, 9.791f, 2.0f, 12.0f, 2.0f)
                curveTo(14.209f, 2.0f, 16.0f, 3.791f, 16.0f, 6.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bugLine!!
    }

private var _bugLine: ImageVector? = null
