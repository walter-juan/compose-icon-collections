package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsToggleLeft: ImageVector
    get() {
        if (_bxsToggleLeft != null) {
            return _bxsToggleLeft!!
        }
        _bxsToggleLeft = Builder(name = "BxsToggleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                curveToRelative(-3.296f, 0.0f, -5.982f, 2.682f, -6.0f, 5.986f)
                verticalLineToRelative(0.042f)
                arcTo(6.01f, 6.01f, 0.0f, false, false, 8.0f, 18.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, false, 6.0f, -5.994f)
                verticalLineToRelative(-0.018f)
                curveTo(21.985f, 8.685f, 19.297f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(8.0f, 15.0f)
                curveToRelative(-1.627f, 0.0f, -3.0f, -1.373f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.373f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.373f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.373f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bxsToggleLeft!!
    }

private var _bxsToggleLeft: ImageVector? = null
