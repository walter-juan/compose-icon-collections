package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.DnaLine: ImageVector
    get() {
        if (_dnaLine != null) {
            return _dnaLine!!
        }
        _dnaLine = Builder(name = "DnaLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                curveTo(18.0f, 1.716f, 17.936f, 2.379f, 17.816f, 3.0f)
                horizontalLineTo(8.232f)
                curveTo(8.414f, 3.727f, 8.7f, 4.383f, 9.081f, 5.0f)
                horizontalLineTo(17.181f)
                curveTo(16.132f, 7.317f, 14.187f, 8.994f, 12.0f, 10.727f)
                curveTo(8.729f, 8.135f, 6.0f, 5.668f, 6.0f, 1.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 6.466f, 7.21f, 9.464f, 10.386f, 12.0f)
                curveTo(7.21f, 14.536f, 4.0f, 17.534f, 4.0f, 23.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 18.04f, 9.08f, 15.566f, 12.618f, 12.786f)
                lineTo(12.71f, 12.714f)
                curveTo(16.149f, 10.012f, 20.0f, 6.987f, 20.0f, 1.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(17.816f, 21.0f)
                horizontalLineTo(8.232f)
                curveTo(8.414f, 20.273f, 8.7f, 19.617f, 9.081f, 19.0f)
                horizontalLineTo(17.181f)
                curveTo(16.394f, 17.262f, 15.103f, 15.884f, 13.583f, 14.572f)
                curveTo(14.116f, 14.152f, 14.653f, 13.735f, 15.181f, 13.309f)
                curveTo(17.766f, 15.598f, 20.0f, 18.44f, 20.0f, 23.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 22.285f, 17.936f, 21.621f, 17.816f, 21.0f)
                close()
            }
        }
        .build()
        return _dnaLine!!
    }

private var _dnaLine: ImageVector? = null
