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

public val RegularGroup.BxConversation: ImageVector
    get() {
        if (_bxConversation != null) {
            return _bxConversation!!
        }
        _bxConversation = Builder(name = "BxConversation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-13.0f)
                curveTo(2.673f, 2.0f, 2.0f, 2.673f, 2.0f, 3.5f)
                lineTo(2.0f, 18.0f)
                lineToRelative(5.333f, -4.0f)
                lineTo(16.0f, 14.0f)
                close()
                moveTo(6.667f, 12.0f)
                lineTo(4.0f, 14.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(8.0f)
                lineTo(6.667f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(6.001f)
                curveToRelative(0.0f, 1.1f, -0.893f, 1.993f, -1.99f, 1.999f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.167f)
                lineTo(22.0f, 22.0f)
                verticalLineTo(9.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _bxConversation!!
    }

private var _bxConversation: ImageVector? = null
