package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlDevTo: ImageVector
    get() {
        if (_bxlDevTo != null) {
            return _bxlDevTo!!
        }
        _bxlDevTo = Builder(name = "BxlDevTo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.826f, 10.083f)
                arcToRelative(0.784f, 0.784f, 0.0f, false, false, -0.468f, -0.175f)
                horizontalLineToRelative(-0.701f)
                verticalLineToRelative(4.198f)
                horizontalLineToRelative(0.701f)
                arcToRelative(0.786f, 0.786f, 0.0f, false, false, 0.469f, -0.175f)
                curveToRelative(0.155f, -0.117f, 0.233f, -0.292f, 0.233f, -0.525f)
                verticalLineToRelative(-2.798f)
                curveToRelative(0.001f, -0.233f, -0.079f, -0.408f, -0.234f, -0.525f)
                close()
                moveTo(19.236f, 3.0f)
                lineTo(4.764f, 3.0f)
                curveTo(3.791f, 3.0f, 3.002f, 3.787f, 3.0f, 4.76f)
                verticalLineToRelative(14.48f)
                curveToRelative(0.002f, 0.973f, 0.791f, 1.76f, 1.764f, 1.76f)
                horizontalLineToRelative(14.473f)
                curveToRelative(0.973f, 0.0f, 1.762f, -0.787f, 1.764f, -1.76f)
                lineTo(21.001f, 4.76f)
                arcTo(1.765f, 1.765f, 0.0f, false, false, 19.236f, 3.0f)
                close()
                moveTo(9.195f, 13.414f)
                curveToRelative(0.0f, 0.755f, -0.466f, 1.901f, -1.942f, 1.898f)
                lineTo(5.389f, 15.312f)
                lineTo(5.389f, 8.665f)
                horizontalLineToRelative(1.903f)
                curveToRelative(1.424f, 0.0f, 1.902f, 1.144f, 1.903f, 1.899f)
                verticalLineToRelative(2.85f)
                close()
                moveTo(13.24f, 9.852f)
                lineTo(11.1f, 9.852f)
                verticalLineToRelative(1.544f)
                horizontalLineToRelative(1.309f)
                verticalLineToRelative(1.188f)
                lineTo(11.1f, 12.584f)
                verticalLineToRelative(1.543f)
                horizontalLineToRelative(2.142f)
                verticalLineToRelative(1.188f)
                horizontalLineToRelative(-2.498f)
                arcToRelative(0.813f, 0.813f, 0.0f, false, true, -0.833f, -0.792f)
                lineTo(9.911f, 9.497f)
                arcToRelative(0.813f, 0.813f, 0.0f, false, true, 0.792f, -0.832f)
                horizontalLineToRelative(2.539f)
                lineToRelative(-0.002f, 1.187f)
                close()
                moveTo(17.405f, 14.484f)
                curveToRelative(-0.531f, 1.235f, -1.481f, 0.99f, -1.906f, 0.0f)
                lineToRelative(-1.548f, -5.818f)
                horizontalLineToRelative(1.309f)
                lineToRelative(1.193f, 4.569f)
                lineToRelative(1.188f, -4.569f)
                horizontalLineToRelative(1.31f)
                lineToRelative(-1.546f, 5.818f)
                close()
            }
        }
        .build()
        return _bxlDevTo!!
    }

private var _bxlDevTo: ImageVector? = null
