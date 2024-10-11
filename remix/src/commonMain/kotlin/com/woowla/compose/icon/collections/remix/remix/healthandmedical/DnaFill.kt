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

public val HealthAndMedicalGroup.DnaFill: ImageVector
    get() {
        if (_dnaFill != null) {
            return _dnaFill!!
        }
        _dnaFill = Builder(name = "DnaFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                curveTo(18.0f, 1.716f, 17.936f, 2.379f, 17.816f, 3.0f)
                horizontalLineTo(8.232f)
                curveTo(8.871f, 5.552f, 10.794f, 7.229f, 13.583f, 9.428f)
                curveTo(13.077f, 9.865f, 12.546f, 10.294f, 12.0f, 10.727f)
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
                curveTo(8.891f, 18.366f, 10.919f, 16.665f, 13.854f, 14.359f)
                curveTo(14.297f, 14.011f, 14.742f, 13.663f, 15.181f, 13.309f)
                curveTo(17.766f, 15.598f, 20.0f, 18.44f, 20.0f, 23.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 22.285f, 17.936f, 21.621f, 17.816f, 21.0f)
                close()
            }
        }
        .build()
        return _dnaFill!!
    }

private var _dnaFill: ImageVector? = null
