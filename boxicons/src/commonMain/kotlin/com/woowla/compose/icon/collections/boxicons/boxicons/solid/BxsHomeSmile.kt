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

public val SolidGroup.BxsHomeSmile: ImageVector
    get() {
        if (_bxsHomeSmile != null) {
            return _bxsHomeSmile!!
        }
        _bxsHomeSmile = Builder(name = "BxsHomeSmile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.913f, -0.593f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.17f, -1.076f)
                lineToRelative(-9.0f, -10.0f)
                curveToRelative(-0.379f, -0.422f, -1.107f, -0.422f, -1.486f, 0.0f)
                lineToRelative(-9.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 14.0f)
                close()
                moveTo(8.949f, 13.684f)
                curveTo(8.98f, 13.779f, 9.762f, 16.0f, 12.0f, 16.0f)
                curveToRelative(2.269f, 0.0f, 3.042f, -2.287f, 3.05f, -2.311f)
                lineToRelative(1.9f, 0.621f)
                curveTo(16.901f, 14.461f, 15.703f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveToRelative(-4.901f, -3.539f, -4.95f, -3.689f)
                lineToRelative(1.899f, -0.627f)
                close()
            }
        }
        .build()
        return _bxsHomeSmile!!
    }

private var _bxsHomeSmile: ImageVector? = null
