package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.PresentationChartLine: ImageVector
    get() {
        if (_presentationChartLine != null) {
            return _presentationChartLine!!
        }
        _presentationChartLine = Builder(name = "PresentationChartLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 2.25f)
                curveTo(1.836f, 2.25f, 1.5f, 2.586f, 1.5f, 3.0f)
                curveTo(1.5f, 3.414f, 1.836f, 3.75f, 2.25f, 3.75f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.25f)
                curveTo(3.0f, 15.907f, 4.343f, 17.25f, 6.0f, 17.25f)
                horizontalLineTo(7.209f)
                lineTo(6.038f, 20.763f)
                curveTo(5.907f, 21.156f, 6.12f, 21.58f, 6.513f, 21.712f)
                curveTo(6.906f, 21.843f, 7.331f, 21.63f, 7.462f, 21.237f)
                lineTo(7.791f, 20.25f)
                horizontalLineTo(16.209f)
                lineTo(16.538f, 21.237f)
                curveTo(16.67f, 21.63f, 17.094f, 21.843f, 17.487f, 21.712f)
                curveTo(17.88f, 21.58f, 18.093f, 21.156f, 17.962f, 20.763f)
                lineTo(16.791f, 17.25f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 17.25f, 21.0f, 15.907f, 21.0f, 14.25f)
                verticalLineTo(3.75f)
                horizontalLineTo(21.75f)
                curveTo(22.164f, 3.75f, 22.5f, 3.414f, 22.5f, 3.0f)
                curveTo(22.5f, 2.586f, 22.164f, 2.25f, 21.75f, 2.25f)
                horizontalLineTo(2.25f)
                close()
                moveTo(8.791f, 17.25f)
                horizontalLineTo(15.209f)
                lineTo(15.709f, 18.75f)
                horizontalLineTo(8.291f)
                lineTo(8.791f, 17.25f)
                close()
                moveTo(16.875f, 8.255f)
                curveTo(17.234f, 8.047f, 17.357f, 7.588f, 17.149f, 7.23f)
                curveTo(16.942f, 6.871f, 16.483f, 6.749f, 16.125f, 6.956f)
                curveTo(14.758f, 7.747f, 13.552f, 8.784f, 12.567f, 10.006f)
                lineTo(11.03f, 8.47f)
                curveTo(10.737f, 8.177f, 10.263f, 8.177f, 9.97f, 8.47f)
                lineTo(6.97f, 11.47f)
                curveTo(6.677f, 11.763f, 6.677f, 12.238f, 6.97f, 12.53f)
                curveTo(7.263f, 12.823f, 7.737f, 12.823f, 8.03f, 12.53f)
                lineTo(10.5f, 10.061f)
                lineTo(12.117f, 11.678f)
                curveTo(12.274f, 11.835f, 12.493f, 11.914f, 12.714f, 11.895f)
                curveTo(12.935f, 11.875f, 13.136f, 11.759f, 13.263f, 11.576f)
                curveTo(14.207f, 10.222f, 15.441f, 9.084f, 16.875f, 8.255f)
                close()
            }
        }
        .build()
        return _presentationChartLine!!
    }

private var _presentationChartLine: ImageVector? = null
