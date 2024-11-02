package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.72f, 13.829f)
                curveTo(6.479f, 13.859f, 6.239f, 13.891f, 6.0f, 13.925f)
                moveTo(6.72f, 13.829f)
                curveTo(8.45f, 13.612f, 10.212f, 13.5f, 12.0f, 13.5f)
                curveTo(13.788f, 13.5f, 15.55f, 13.612f, 17.28f, 13.829f)
                moveTo(6.72f, 13.829f)
                lineTo(6.341f, 18.0f)
                moveTo(17.28f, 13.829f)
                curveTo(17.521f, 13.859f, 17.761f, 13.891f, 18.0f, 13.925f)
                moveTo(17.28f, 13.829f)
                lineTo(17.659f, 18.0f)
                moveTo(17.659f, 18.0f)
                lineTo(17.889f, 20.523f)
                curveTo(17.948f, 21.182f, 17.43f, 21.75f, 16.768f, 21.75f)
                horizontalLineTo(7.232f)
                curveTo(6.57f, 21.75f, 6.052f, 21.182f, 6.112f, 20.523f)
                lineTo(6.341f, 18.0f)
                moveTo(17.659f, 18.0f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 18.0f, 21.0f, 16.993f, 21.0f, 15.75f)
                verticalLineTo(9.456f)
                curveTo(21.0f, 8.375f, 20.232f, 7.441f, 19.163f, 7.281f)
                curveTo(18.529f, 7.186f, 17.892f, 7.104f, 17.25f, 7.034f)
                moveTo(6.341f, 18.0f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 18.0f, 3.0f, 16.993f, 3.0f, 15.75f)
                verticalLineTo(9.456f)
                curveTo(3.0f, 8.375f, 3.768f, 7.441f, 4.837f, 7.281f)
                curveTo(5.471f, 7.186f, 6.108f, 7.104f, 6.75f, 7.034f)
                moveTo(17.25f, 7.034f)
                curveTo(15.526f, 6.846f, 13.774f, 6.75f, 12.0f, 6.75f)
                curveTo(10.226f, 6.75f, 8.474f, 6.846f, 6.75f, 7.034f)
                moveTo(17.25f, 7.034f)
                verticalLineTo(3.375f)
                curveTo(17.25f, 2.754f, 16.746f, 2.25f, 16.125f, 2.25f)
                horizontalLineTo(7.875f)
                curveTo(7.254f, 2.25f, 6.75f, 2.754f, 6.75f, 3.375f)
                verticalLineTo(7.034f)
                moveTo(18.0f, 10.5f)
                horizontalLineTo(18.007f)
                verticalLineTo(10.507f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(15.0f, 10.5f)
                horizontalLineTo(15.007f)
                verticalLineTo(10.507f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
