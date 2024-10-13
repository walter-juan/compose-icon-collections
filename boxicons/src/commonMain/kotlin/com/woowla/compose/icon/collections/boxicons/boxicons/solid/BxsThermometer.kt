package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsThermometer: ImageVector
    get() {
        if (_bxsThermometer != null) {
            return _bxsThermometer!!
        }
        _bxsThermometer = Builder(name = "BxsThermometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 16.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, false, 6.0f, 0.0f)
                curveToRelative(0.0f, -0.353f, -0.072f, -0.686f, -0.184f, -1.0f)
                horizontalLineTo(9.184f)
                arcTo(2.962f, 2.962f, 0.0f, false, false, 9.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineToRelative(-3.185f)
                arcTo(2.995f, 2.995f, 0.0f, false, false, 12.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.8f)
                arcTo(6.027f, 6.027f, 0.0f, false, false, 6.0f, 16.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                arcToRelative(6.027f, 6.027f, 0.0f, false, false, -3.0f, -5.2f)
                lineTo(15.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.595f, 12.324f)
                arcTo(4.033f, 4.033f, 0.0f, false, true, 16.0f, 16.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.585f, 0.944f, -3.027f, 2.405f, -3.676f)
                lineToRelative(0.595f, -0.263f)
                lineTo(11.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(7.061f)
                lineToRelative(0.595f, 0.263f)
                close()
            }
        }
        .build()
        return _bxsThermometer!!
    }

private var _bxsThermometer: ImageVector? = null
