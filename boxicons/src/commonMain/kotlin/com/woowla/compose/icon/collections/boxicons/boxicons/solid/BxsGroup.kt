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

public val SolidGroup.BxsGroup: ImageVector
    get() {
        if (_bxsGroup != null) {
            return _bxsGroup!!
        }
        _bxsGroup = Builder(name = "BxsGroup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 12.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.604f, 11.048f)
                arcToRelative(5.67f, 5.67f, 0.0f, false, false, 0.751f, -3.44f)
                curveToRelative(-0.179f, -1.784f, -1.175f, -3.361f, -2.803f, -4.44f)
                lineToRelative(-1.105f, 1.666f)
                curveToRelative(1.119f, 0.742f, 1.8f, 1.799f, 1.918f, 2.974f)
                arcToRelative(3.693f, 3.693f, 0.0f, false, true, -1.072f, 2.986f)
                lineToRelative(-1.192f, 1.192f)
                lineToRelative(1.618f, 0.475f)
                curveTo(18.951f, 13.701f, 19.0f, 17.957f, 19.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.789f, -0.956f, -5.285f, -4.396f, -6.952f)
                close()
            }
        }
        .build()
        return _bxsGroup!!
    }

private var _bxsGroup: ImageVector? = null
