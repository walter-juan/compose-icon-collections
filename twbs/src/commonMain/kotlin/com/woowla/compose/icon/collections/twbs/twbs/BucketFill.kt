package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BucketFill: ImageVector
    get() {
        if (_bucketFill != null) {
            return _bucketFill!!
        }
        _bucketFill = Builder(name = "BucketFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.522f, 5.0f)
                horizontalLineTo(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.494f, 0.574f)
                lineToRelative(1.372f, 9.149f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.36f, 16.0f)
                horizontalLineToRelative(7.278f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.483f, -1.277f)
                lineToRelative(1.373f, -9.149f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 5.0f)
                horizontalLineToRelative(-0.522f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 2.522f, 5.0f)
                moveToRelative(1.005f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 8.945f, 0.0f)
                close()
            }
        }
        .build()
        return _bucketFill!!
    }

private var _bucketFill: ImageVector? = null
