package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.FediverseLine: ImageVector
    get() {
        if (_fediverseLine != null) {
            return _fediverseLine!!
        }
        _fediverseLine = Builder(name = "FediverseLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.5f)
                verticalLineTo(8.232f)
                lineTo(8.17f, 9.866f)
                lineTo(7.17f, 8.134f)
                lineTo(10.0f, 6.5f)
                lineTo(7.17f, 4.866f)
                lineTo(8.17f, 3.134f)
                lineTo(11.0f, 4.768f)
                verticalLineTo(1.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.768f)
                lineTo(15.83f, 3.134f)
                lineTo(16.83f, 4.866f)
                lineTo(14.0f, 6.5f)
                lineTo(16.83f, 8.134f)
                lineTo(15.83f, 9.866f)
                lineTo(13.0f, 8.232f)
                verticalLineTo(11.5f)
                horizontalLineTo(11.0f)
                close()
                moveTo(21.46f, 12.884f)
                lineTo(18.629f, 14.518f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.629f)
                verticalLineTo(14.518f)
                lineTo(13.799f, 12.884f)
                lineTo(12.799f, 14.616f)
                lineTo(15.629f, 16.25f)
                lineTo(12.799f, 17.884f)
                lineTo(13.799f, 19.616f)
                lineTo(16.629f, 17.982f)
                verticalLineTo(21.25f)
                horizontalLineTo(18.629f)
                verticalLineTo(17.982f)
                lineTo(21.459f, 19.616f)
                lineTo(22.459f, 17.884f)
                lineTo(19.629f, 16.25f)
                lineTo(22.46f, 14.616f)
                lineTo(21.46f, 12.884f)
                close()
                moveTo(7.371f, 17.982f)
                lineTo(7.371f, 21.25f)
                lineTo(5.371f, 21.25f)
                lineTo(5.371f, 17.982f)
                lineTo(2.541f, 19.615f)
                lineTo(1.541f, 17.883f)
                lineTo(4.371f, 16.25f)
                lineTo(1.541f, 14.616f)
                lineTo(2.541f, 12.884f)
                lineTo(5.371f, 14.517f)
                lineTo(5.371f, 11.25f)
                horizontalLineTo(7.371f)
                lineTo(7.371f, 14.517f)
                lineTo(10.201f, 12.884f)
                lineTo(11.201f, 14.616f)
                lineTo(8.371f, 16.25f)
                lineTo(11.201f, 17.883f)
                lineTo(10.201f, 19.615f)
                lineTo(7.371f, 17.982f)
                close()
            }
        }
        .build()
        return _fediverseLine!!
    }

private var _fediverseLine: ImageVector? = null
