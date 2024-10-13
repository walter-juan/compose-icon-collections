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

public val SolidGroup.BxsCommentX: ImageVector
    get() {
        if (_bxsCommentX != null) {
            return _bxsCommentX!!
        }
        _bxsCommentX = Builder(name = "BxsCommentX", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.706f, 13.543f)
                lineTo(15.292f, 14.957f)
                lineTo(11.999f, 11.665f)
                lineTo(8.707f, 14.957f)
                lineTo(7.293f, 13.543f)
                lineTo(10.585f, 10.251f)
                lineTo(7.293f, 6.958f)
                lineTo(8.707f, 5.544f)
                lineTo(11.999f, 8.836f)
                lineTo(15.292f, 5.544f)
                lineTo(16.706f, 6.958f)
                lineTo(13.414f, 10.251f)
                lineTo(16.706f, 13.543f)
                close()
            }
        }
        .build()
        return _bxsCommentX!!
    }

private var _bxsCommentX: ImageVector? = null
