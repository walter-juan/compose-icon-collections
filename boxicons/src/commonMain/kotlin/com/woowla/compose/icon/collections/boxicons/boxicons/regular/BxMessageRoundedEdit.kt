package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxMessageRoundedEdit: ImageVector
    get() {
        if (_bxMessageRoundedEdit != null) {
            return _bxMessageRoundedEdit!!
        }
        _bxMessageRoundedEdit = Builder(name = "BxMessageRoundedEdit", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 5.589f, 2.0f, 10.0f)
                curveToRelative(0.0f, 2.908f, 1.898f, 5.515f, 5.0f, 6.934f)
                lineTo(7.0f, 22.0f)
                lineToRelative(5.34f, -4.005f)
                curveTo(17.697f, 17.852f, 22.0f, 14.32f, 22.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, -4.486f, -8.0f, -10.0f, -8.0f)
                close()
                moveTo(12.0f, 16.0f)
                horizontalLineToRelative(-0.333f)
                lineTo(9.0f, 18.0f)
                verticalLineToRelative(-2.417f)
                lineToRelative(-0.641f, -0.247f)
                curveTo(5.67f, 14.301f, 4.0f, 12.256f, 4.0f, 10.0f)
                curveToRelative(0.0f, -3.309f, 3.589f, -6.0f, 8.0f, -6.0f)
                reflectiveCurveToRelative(8.0f, 2.691f, 8.0f, 6.0f)
                reflectiveCurveToRelative(-3.589f, 6.0f, -8.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.503f, 11.589f)
                verticalLineToRelative(1.398f)
                horizontalLineToRelative(1.398f)
                lineToRelative(3.87f, -3.864f)
                lineToRelative(-1.399f, -1.398f)
                close()
                moveTo(14.43f, 8.464f)
                lineTo(13.032f, 7.066f)
                lineTo(14.099f, 5.999f)
                lineTo(15.497f, 7.397f)
                close()
            }
        }
        .build()
        return _bxMessageRoundedEdit!!
    }

private var _bxMessageRoundedEdit: ImageVector? = null
