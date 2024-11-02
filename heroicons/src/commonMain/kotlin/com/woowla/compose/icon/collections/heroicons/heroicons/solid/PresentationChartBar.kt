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

public val SolidGroup.PresentationChartBar: ImageVector
    get() {
        if (_presentationChartBar != null) {
            return _presentationChartBar!!
        }
        _presentationChartBar = Builder(name = "PresentationChartBar", defaultWidth = 24.0.dp,
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
                moveTo(8.291f, 18.75f)
                lineTo(8.791f, 17.25f)
                horizontalLineTo(15.209f)
                lineTo(15.709f, 18.75f)
                horizontalLineTo(8.291f)
                close()
                moveTo(15.75f, 6.75f)
                curveTo(15.75f, 6.336f, 15.414f, 6.0f, 15.0f, 6.0f)
                curveTo(14.586f, 6.0f, 14.25f, 6.336f, 14.25f, 6.75f)
                verticalLineTo(12.75f)
                curveTo(14.25f, 13.164f, 14.586f, 13.5f, 15.0f, 13.5f)
                curveTo(15.414f, 13.5f, 15.75f, 13.164f, 15.75f, 12.75f)
                verticalLineTo(6.75f)
                close()
                moveTo(12.75f, 9.0f)
                curveTo(12.75f, 8.586f, 12.414f, 8.25f, 12.0f, 8.25f)
                curveTo(11.586f, 8.25f, 11.25f, 8.586f, 11.25f, 9.0f)
                verticalLineTo(12.75f)
                curveTo(11.25f, 13.164f, 11.586f, 13.5f, 12.0f, 13.5f)
                curveTo(12.414f, 13.5f, 12.75f, 13.164f, 12.75f, 12.75f)
                verticalLineTo(9.0f)
                close()
                moveTo(9.75f, 11.25f)
                curveTo(9.75f, 10.836f, 9.414f, 10.5f, 9.0f, 10.5f)
                curveTo(8.586f, 10.5f, 8.25f, 10.836f, 8.25f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(8.25f, 13.164f, 8.586f, 13.5f, 9.0f, 13.5f)
                curveTo(9.414f, 13.5f, 9.75f, 13.164f, 9.75f, 12.75f)
                verticalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _presentationChartBar!!
    }

private var _presentationChartBar: ImageVector? = null
