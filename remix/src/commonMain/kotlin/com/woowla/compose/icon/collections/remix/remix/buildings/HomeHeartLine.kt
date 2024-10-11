package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.HomeHeartLine: ImageVector
    get() {
        if (_homeHeartLine != null) {
            return _homeHeartLine!!
        }
        _homeHeartLine = Builder(name = "HomeHeartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                curveTo(20.0f, 20.552f, 19.552f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 21.0f, 4.0f, 20.552f, 4.0f, 20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                lineTo(11.327f, 1.612f)
                curveTo(11.709f, 1.265f, 12.291f, 1.265f, 12.673f, 1.612f)
                lineTo(23.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(18.0f, 19.0f)
                verticalLineTo(9.157f)
                lineTo(12.0f, 3.703f)
                lineTo(6.0f, 9.157f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(12.0f, 17.0f)
                lineTo(8.641f, 13.641f)
                curveTo(7.763f, 12.762f, 7.763f, 11.338f, 8.641f, 10.459f)
                curveTo(9.52f, 9.581f, 10.944f, 9.581f, 11.823f, 10.459f)
                lineTo(12.0f, 10.636f)
                lineTo(12.177f, 10.459f)
                curveTo(13.056f, 9.581f, 14.48f, 9.581f, 15.359f, 10.459f)
                curveTo(16.237f, 11.338f, 16.237f, 12.762f, 15.359f, 13.641f)
                lineTo(12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _homeHeartLine!!
    }

private var _homeHeartLine: ImageVector? = null
