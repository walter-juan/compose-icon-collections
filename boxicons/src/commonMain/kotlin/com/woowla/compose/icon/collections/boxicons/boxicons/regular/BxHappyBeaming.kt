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

public val RegularGroup.BxHappyBeaming: ImageVector
    get() {
        if (_bxHappyBeaming != null) {
            return _bxHappyBeaming!!
        }
        _bxHappyBeaming = Builder(name = "BxHappyBeaming", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveToRelative(4.0f, 0.0f, 5.0f, -4.0f, 5.0f, -4.0f)
                horizontalLineTo(7.0f)
                reflectiveCurveToRelative(1.0f, 4.0f, 5.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 12.0f)
                lineToRelative(2.0f, 0.012f)
                curveToRelative(0.012f, -0.462f, 0.194f, -1.012f, 1.0f, -1.012f)
                reflectiveCurveToRelative(0.988f, 0.55f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.206f, -0.799f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.794f, -3.0f, 3.0f)
                close()
                moveTo(8.0f, 11.0f)
                curveToRelative(0.806f, 0.0f, 0.988f, 0.55f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.206f, -0.799f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.794f, -3.0f, 3.0f)
                lineToRelative(2.0f, 0.012f)
                curveTo(7.012f, 11.55f, 7.194f, 11.0f, 8.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bxHappyBeaming!!
    }

private var _bxHappyBeaming: ImageVector? = null
