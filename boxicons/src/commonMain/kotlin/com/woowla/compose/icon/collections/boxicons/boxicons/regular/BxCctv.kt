package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCctv: ImageVector
    get() {
        if (_bxCctv != null) {
            return _bxCctv!!
        }
        _bxCctv = Builder(name = "BxCctv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.916f, 9.564f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.513f, -1.316f)
                lineTo(7.328f, 2.492f)
                curveToRelative(-0.995f, -0.438f, -2.22f, 0.051f, -2.645f, 1.042f)
                lineToRelative(-2.21f, 5.154f)
                arcToRelative(2.001f, 2.001f, 0.0f, false, false, 1.052f, 2.624f)
                lineTo(9.563f, 13.9f)
                lineTo(8.323f, 17.0f)
                lineTo(4.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.323f)
                curveToRelative(0.823f, 0.0f, 1.552f, -0.494f, 1.856f, -1.258f)
                lineToRelative(1.222f, -3.054f)
                lineToRelative(5.205f, 2.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.31f, -0.517f)
                lineToRelative(0.312f, -0.71f)
                lineToRelative(1.701f, 0.68f)
                lineToRelative(2.0f, -5.0f)
                lineToRelative(-1.536f, -0.613f)
                lineToRelative(0.523f, -1.194f)
                close()
                moveTo(16.482f, 14.69f)
                lineTo(4.313f, 9.475f)
                lineToRelative(2.208f, -5.152f)
                lineToRelative(12.162f, 5.354f)
                lineToRelative(-2.201f, 5.013f)
                close()
            }
        }
        .build()
        return _bxCctv!!
    }

private var _bxCctv: ImageVector? = null
