package com.woowla.compose.icon.collections.boxicons.boxicons.logos

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
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlPatreon: ImageVector
    get() {
        if (_bxlPatreon != null) {
            return _bxlPatreon!!
        }
        _bxlPatreon = Builder(name = "BxlPatreon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.508f, 9.831f)
                moveToRelative(-6.496f, 0.0f)
                arcToRelative(6.496f, 6.496f, 0.0f, true, true, 12.992f, 0.0f)
                arcToRelative(6.496f, 6.496f, 0.0f, true, true, -12.992f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.996f, 3.335f)
                horizontalLineTo(6.17f)
                verticalLineToRelative(17.33f)
                horizontalLineTo(2.996f)
                close()
            }
        }
        .build()
        return _bxlPatreon!!
    }

private var _bxlPatreon: ImageVector? = null
