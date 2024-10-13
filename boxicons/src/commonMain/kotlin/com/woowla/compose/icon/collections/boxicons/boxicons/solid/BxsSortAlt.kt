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

public val SolidGroup.BxsSortAlt: ImageVector
    get() {
        if (_bxsSortAlt != null) {
            return _bxsSortAlt!!
        }
        _bxsSortAlt = Builder(name = "BxsSortAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.227f, 11.0f)
                horizontalLineToRelative(11.547f)
                curveToRelative(0.862f, 0.0f, 1.32f, -1.02f, 0.747f, -1.665f)
                lineTo(12.748f, 2.84f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -1.494f, 0.0f)
                lineTo(5.479f, 9.335f)
                curveTo(4.906f, 9.98f, 5.364f, 11.0f, 6.227f, 11.0f)
                close()
                moveTo(11.253f, 21.159f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 1.494f, 0.0f)
                lineToRelative(5.773f, -6.495f)
                curveToRelative(0.574f, -0.644f, 0.116f, -1.664f, -0.747f, -1.664f)
                lineTo(6.227f, 13.0f)
                curveToRelative(-0.862f, 0.0f, -1.32f, 1.02f, -0.747f, 1.665f)
                lineToRelative(5.773f, 6.494f)
                close()
            }
        }
        .build()
        return _bxsSortAlt!!
    }

private var _bxsSortAlt: ImageVector? = null
