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

public val RegularGroup.BxSubdirectoryLeft: ImageVector
    get() {
        if (_bxSubdirectoryLeft != null) {
            return _bxSubdirectoryLeft!!
        }
        _bxSubdirectoryLeft = Builder(name = "BxSubdirectoryLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-5.0f, 4.0f)
                lineToRelative(5.0f, 4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _bxSubdirectoryLeft!!
    }

private var _bxSubdirectoryLeft: ImageVector? = null
